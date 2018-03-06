package com.amazonaws.services.s3.model.metadata;

import java.io.Serializable;

/**
 * The Class CustomMetadataEntry.
 */
public class CustomMetadataEntry implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5157373490495983845L;

	/** The name. */
	private String name;

	/** The value. */
	private String value;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Gets the value.
	 *
	 * @return the value
	 */
	public String getValue() {
		return value;
	}

	/**
	 * Sets the value.
	 *
	 * @param value
	 *            the new value
	 */
	public void setValue(String value) {
		this.value = value;
	}

}
