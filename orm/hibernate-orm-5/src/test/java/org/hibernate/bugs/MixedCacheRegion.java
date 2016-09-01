package org.hibernate.bugs;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "mixedRegion")
public class MixedCacheRegion {

	@Id
	@GeneratedValue
	private Long id;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "mixedRegion")
	private List<MixedCacheRegionListElement> elements;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<MixedCacheRegionListElement> getElements() {
		return elements;
	}

	public void setElements(List<MixedCacheRegionListElement> elements) {
		this.elements = elements;
	}
}
