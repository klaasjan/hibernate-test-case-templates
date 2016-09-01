package org.hibernate.bugs;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class MixedCacheRegionListElement {

	@Id
	private Long id;
	
	@JoinColumn(name = "parent")
	@ManyToOne(fetch = FetchType.LAZY)
	private MixedCacheRegion parent;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MixedCacheRegion getParent() {
		return parent;
	}

	public void setParent(MixedCacheRegion parent) {
		this.parent = parent;
	}
}
