package com.jdc.hwy.fields;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.jdc.hwy.fields.E_ColumnMapping.Member;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.MapKeyEnumerated;
import jakarta.persistence.OrderBy;
import jakarta.persistence.OrderColumn;
import lombok.Data;

@Data
//@Entity
public class F_CollectionMapping {
	
	@Id
	private int id;
	private String value;
	
	@Embedded     
	private C_EmbeddableClass emb;
	
	@ElementCollection
	@Column(name = "string_set")
	@CollectionTable(name = "set_tbl",
	joinColumns = {@JoinColumn(name = "set_id")})
	private Set<String> sets;
	
	@ElementCollection
	@OrderBy("list_id")
	@Column(name = "string_list")
	@CollectionTable(name = "list_tbl", 
	joinColumns = {@JoinColumn(name = "list_id")})
	private List<String> list;
	
	@ElementCollection
	@OrderColumn(name = "key_id")
	@Column(name = "string_map")
	@MapKeyColumn(name = "key_id")
	@CollectionTable(name = "map_tbl",
	joinColumns = {@JoinColumn(name = "map_id")})
	private Map<Integer, String> map;
	
	@ElementCollection
	@Enumerated(EnumType.STRING)  // map's value
	@MapKeyEnumerated(EnumType.STRING)  // map's key
	private Map<Member, Member> members;
	
	

}
