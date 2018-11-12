package com.banking.retail.dao.util;

import java.util.Properties;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.stat.Statistics;

import com.banking.retail.util.HelloLogger;

public class HibernateUtil {

	private static SessionFactory oracleSessionFactory;

	private HibernateUtil() {
	}

	private static void loadHibernateConfigFileForOracle() {
		String cfgFile = "/resources/config/hibernate-oracle.cfg.xml";
		String propsFile = "/resources/config/hibernate-oracle.properties";

		try {
			System.out.println("[HibernateUtil] Loading Oracle hibernate config file");
			Configuration configuration = new Configuration();
			configuration.configure(cfgFile);

			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
					.applySettings(configuration.getProperties()).build();
			oracleSessionFactory = configuration.buildSessionFactory(serviceRegistry);
			System.out.println("[HibernateUtil] Oracle Hibernate config file is loaded");
		} catch (Throwable ex) {
			ex.printStackTrace();
			System.err.println(ex);
		}

	}

	public static SessionFactory getOracleSessionFactory() {
		if (oracleSessionFactory == null)
			loadHibernateConfigFileForOracle();
		return oracleSessionFactory;
	}

	public static void loadConfigFiles() {
		loadHibernateConfigFileForOracle();
	}

	public static void closeConfig() {

		if (oracleSessionFactory != null && !oracleSessionFactory.isClosed()) {

			Statistics statistics = oracleSessionFactory.getStatistics();

			HelloLogger.info("EntityInsertCount=" + statistics.getEntityInsertCount());
			HelloLogger.info("EntityDeleteCount=" + statistics.getEntityDeleteCount());
			HelloLogger.info("EntityFetchCount=" + statistics.getEntityFetchCount());
			HelloLogger.info("EntityUpdateCount=" + statistics.getEntityUpdateCount());
			HelloLogger.info("EntityLoadCount=" + statistics.getEntityLoadCount());

			HelloLogger.info("SecondLevelCacheHitCount=" + statistics.getSecondLevelCacheHitCount());
			HelloLogger.info("SecondLevelCachePutCount=" + statistics.getSecondLevelCachePutCount());
			HelloLogger.info("SecondLevelCacheMissCount=" + statistics.getSecondLevelCacheMissCount());

			HelloLogger.info("CollectionFetchCount=" + statistics.getCollectionFetchCount());
			HelloLogger.info("CollectionLoadCount=" + statistics.getCollectionLoadCount());
			HelloLogger.info("CollectionRemoveCount=" + statistics.getCollectionRemoveCount());
			HelloLogger.info("CollectionUpdateCount=" + statistics.getCollectionUpdateCount());
			HelloLogger.info("CollectionRecreateCount=" + statistics.getCollectionRecreateCount());

			HelloLogger.info("SessionOpenCount=" + statistics.getSessionOpenCount());
			HelloLogger.info("SessionCloseCount=" + statistics.getSessionCloseCount());
			HelloLogger.info("TransactionCount=" + statistics.getTransactionCount());
			HelloLogger.info("SuccessfulTransactionCount=" + statistics.getSuccessfulTransactionCount());

			oracleSessionFactory.close();
		}
		oracleSessionFactory = null;
		HelloLogger.info("All are closed");
	}

	public static void closeSession(Session session) {
		if (session != null)
			session.close();
	}

	public static Session getOracleSession() {
		return oracleSessionFactory.openSession();
	}

	static {
		loadConfigFiles();
		System.out.println("Loaded Config files");
	}

	public void finalize() {
		closeConfig();
	}

}
