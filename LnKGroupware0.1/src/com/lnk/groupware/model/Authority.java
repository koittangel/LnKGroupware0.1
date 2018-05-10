package com.lnk.groupware.model;

import java.io.Serializable;

public class Authority implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer authorityId;
	private String authorityName;
	
	public Authority() {}

	public Authority(Integer authorityId, String authorityName) {
		this.authorityId = authorityId;
		this.authorityName = authorityName;
	}

	public Integer getAuthorityId() {
		return authorityId;
	}

	public void setAuthorityId(Integer authorityId) {
		this.authorityId = authorityId;
	}

	public String getAuthorityName() {
		return authorityName;
	}

	public void setAuthorityName(String authorityName) {
		this.authorityName = authorityName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authorityId == null) ? 0 : authorityId.hashCode());
		result = prime * result + ((authorityName == null) ? 0 : authorityName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Authority)) {
			return false;
		}
		
		Authority other = (Authority) obj;
		if (this.authorityId.equals(other.authorityId)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Authority [authorityId=");
		builder.append(authorityId);
		builder.append(", authorityName=");
		builder.append(authorityName);
		builder.append("]");
		return builder.toString();
	}
	
}