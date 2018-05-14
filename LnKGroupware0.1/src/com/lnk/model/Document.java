package com.lnk.model;

import java.io.Serializable;

public class Document implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer documentNo;			// 문서 종류 번호
	private String documentName;		// 문서 명
	
	public Document() {}

	public Document(Integer documentNo, String documentName) {
		super();
		this.documentNo = documentNo;
		this.documentName = documentName;
	}

	public Integer getDocumentNo() {
		return documentNo;
	}

	public void setDocumentNo(Integer documentNo) {
		this.documentNo = documentNo;
	}

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((documentName == null) ? 0 : documentName.hashCode());
		result = prime * result + ((documentNo == null) ? 0 : documentNo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Document)) {
			return false;
		}
		
		Document other = (Document) obj;
		if (this.documentNo.equals(other.documentNo)) {
			return true;
		}
		
		return false;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Document [documentNo=");
		builder.append(documentNo);
		builder.append(", documentName=");
		builder.append(documentName);
		builder.append("]");
		return builder.toString();
	}
	
}
