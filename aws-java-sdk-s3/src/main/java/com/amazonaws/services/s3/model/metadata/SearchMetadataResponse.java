package com.amazonaws.services.s3.model.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class SearchMetadataResponse implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -815491755882655400L;

	/** The marker. */
	private String marker = null;

	/** The objects. */
	private List<MetadataObject> objects = new ArrayList<MetadataObject>();

	/** The is truncated. */
	private boolean isTruncated = false;

	/**
	 * The marker to use in order to request the next page of results - only
	 * populated if the isTruncated member indicates that this object listing is
	 * truncated.
	 */
	private String nextMarker;

	/**
	 * Gets the marker.
	 *
	 * @return the marker
	 */
	public String getMarker() {
		return marker;
	}

	/**
	 * Sets the marker.
	 *
	 * @param marker
	 *            the new marker
	 */
	public void setMarker(String marker) {
		this.marker = marker;
	}

	/**
	 * Gets the objects.
	 *
	 * @return the objects
	 */
	public List<MetadataObject> getObjects() {
		return objects;
	}

	/**
	 * Sets the objects.
	 *
	 * @param objects
	 *            the new objects
	 */
	public void setObjects(List<MetadataObject> objects) {
		this.objects = objects;
	}

	/**
	 * Checks if is truncated.
	 *
	 * @return true, if is truncated
	 */
	public boolean isTruncated() {
		return isTruncated;
	}

	/**
	 * Sets the truncated.
	 *
	 * @param isTruncated
	 *            the new truncated
	 */
	public void setTruncated(boolean isTruncated) {
		this.isTruncated = isTruncated;
	}

	public String getNextMarker() {
		return nextMarker;
	}

	public void setNextMarker(String nextMarker) {
		this.nextMarker = nextMarker;
	}

}
