package com.amazonaws.services.s3.model.metadata;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * The Class CustomMetadataObject.
 */
public class CustomMetadataObject implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2309651259118186508L;

	/** The metadata entries. */
	private List<CustomMetadataEntry> metadataEntries = new ArrayList<CustomMetadataEntry>();

	/**
	 * Gets the metadata entries.
	 *
	 * @return the metadata entries
	 */
	public List<CustomMetadataEntry> getMetadataEntries() {
		return metadataEntries;
	}

	/**
	 * Sets the metadata entries.
	 *
	 * @param metadataEntries
	 *            the new metadata entries
	 */
	public void setMetadataEntries(List<CustomMetadataEntry> metadataEntries) {
		this.metadataEntries = metadataEntries;
	}

}
