package com.amazonaws.services.s3.model.metadata;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * The Class SearchMetadataRequest.
 */
public class SearchMetadataRequest extends AmazonWebServiceRequest implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -710342776596504881L;
	
	/** The bucket name. */
	private final String bucketName;
	
	/** The search query. */
	private final String searchQuery;

	
	/**
	 * Instantiates a new search metadata request.
	 *
	 * @param bucketName the bucket name
	 * @param searchQuery the search query
	 */
	public SearchMetadataRequest(String bucketName, String searchQuery) {
		this.bucketName = bucketName;
		this.searchQuery = searchQuery;
	}
	
	/**
	 * Gets the bucket name.
	 *
	 * @return the bucket name
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * Gets the search query.
	 *
	 * @return the search query
	 */
	public String getSearchQuery() {
		return searchQuery;
	}

}
