package com.github.justcoke.dropwizard.jcr;

import java.io.IOException;
import java.net.MalformedURLException;

import javax.jcr.Repository;
import javax.jcr.RepositoryException;

import com.codahale.metrics.MetricRegistry;

/**
 * Interface of a factory that produces JDBC data sources backed by the
 * connection pool.
 */
public interface JcrRepositoryFactory {
	/**
	 * Builds a new JDBC data source backed by the connection pool and managed
	 * by Dropwizard.
	 *
	 * @param metricRegistry
	 *            the application metric registry
	 * @return the repository {@link Repository}
	 */
	Repository build(MetricRegistry metricRegistry) throws RepositoryException, MalformedURLException, IOException;
}
