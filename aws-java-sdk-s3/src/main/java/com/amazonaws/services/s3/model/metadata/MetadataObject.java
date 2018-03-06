package com.amazonaws.services.s3.model.metadata;

import java.io.Serializable;
import java.util.Date;

import com.amazonaws.services.s3.model.Owner;
import com.amazonaws.services.s3.model.S3Object;

/**
 * The Class MetadataObject.
 */
public class MetadataObject implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -8855361442161021426L;

	/** The owner. */
	private Owner owner = null;

	/** The key under which this object is stored. */
	private String key = null;

	/** The name of the bucket in which this object is contained. */
	private String bucketName = null;

	/** The content type. */
	private String contentType = null;

	/** The last modified. */
	private Date lastModified = null;

	/** The instance. */
	private String instance = null;

	/** The e tag. */
	private String eTag = null;

	/** The versioned epoch. */
	private Integer versionedEpoch = 0;

	/** The custom metadata. */
	private CustomMetadataObject customMetadata;

	/** The size. */
	private Long size = 0l;

	/**
	 * Gets the name of the bucket in which this object is contained.
	 *
	 * @return The name of the bucket in which this object is contained.
	 *
	 * @see S3Object#setBucketName(String)
	 */
	public String getBucketName() {
		return bucketName;
	}

	/**
	 * Sets the name of the bucket in which this object is contained.
	 *
	 * @param bucketName
	 *            The name of the bucket containing this object.
	 *
	 * @see S3Object#getBucketName()
	 */
	public void setBucketName(String bucketName) {
		this.bucketName = bucketName;
	}

	/**
	 * Gets the key under which this object is stored.
	 *
	 * @return The key under which this object is stored.
	 *
	 * @see S3Object#setKey(String)
	 */
	public String getKey() {
		return key;
	}

	/**
	 * Sets the key under which this object is stored.
	 *
	 * @param key
	 *            The key under which this object is stored.
	 *
	 * @see S3Object#getKey()
	 */
	public void setKey(String key) {
		this.key = key;
	}

	/**
	 * Gets the owner.
	 *
	 * @return the owner
	 */
	public Owner getOwner() {
		return owner;
	}

	/**
	 * Sets the owner.
	 *
	 * @param owner
	 *            the new owner
	 */
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	/**
	 * Gets the content type.
	 *
	 * @return the content type
	 */
	public String getContentType() {
		return contentType;
	}

	/**
	 * Sets the content type.
	 *
	 * @param contentType
	 *            the new content type
	 */
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	/**
	 * Gets the last modified.
	 *
	 * @return the last modified
	 */
	public Date getLastModified() {
		return lastModified;
	}

	/**
	 * Sets the last modified.
	 *
	 * @param lastModified
	 *            the new last modified
	 */
	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	/**
	 * Gets the single instance of MetadataObject.
	 *
	 * @return single instance of MetadataObject
	 */
	public String getInstance() {
		return instance;
	}

	/**
	 * Sets the instance.
	 *
	 * @param instance
	 *            the new instance
	 */
	public void setInstance(String instance) {
		this.instance = instance;
	}

	/**
	 * Gets the e tag.
	 *
	 * @return the e tag
	 */
	public String geteTag() {
		return eTag;
	}

	/**
	 * Sets the e tag.
	 *
	 * @param eTag
	 *            the new e tag
	 */
	public void seteTag(String eTag) {
		this.eTag = eTag;
	}

	/**
	 * Gets the versioned epoch.
	 *
	 * @return the versioned epoch
	 */
	public Integer getVersionedEpoch() {
		return versionedEpoch;
	}

	/**
	 * Sets the versioned epoch.
	 *
	 * @param versionedEpoch
	 *            the new versioned epoch
	 */
	public void setVersionedEpoch(Integer versionedEpoch) {
		this.versionedEpoch = versionedEpoch;
	}

	/**
	 * Gets the custom metadata.
	 *
	 * @return the custom metadata
	 */
	public CustomMetadataObject getCustomMetadata() {
		return customMetadata;
	}

	/**
	 * Sets the custom metadata.
	 *
	 * @param customMetadata
	 *            the new custom metadata
	 */
	public void setCustomMetadata(CustomMetadataObject customMetadata) {
		this.customMetadata = customMetadata;
	}

	/**
	 * Gets the size.
	 *
	 * @return the size
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * Sets the size.
	 *
	 * @param size
	 *            the new size
	 */
	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * To string.
	 *
	 * @return the string
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "MetadataObject [key=" + getKey() + ",bucket=" + (bucketName == null ? "<Unknown>" : bucketName) + "]";
	}
}
