package com.kubeiwu.wangyi.pojo;

import android.provider.BaseColumns;

import com.kubeiwu.commontool.db.utils.A.Property;
import com.kubeiwu.commontool.db.utils.A.Table;

@Table(name = "GroupImageInfo")
public class GroupImageInfo {
	@Property(column = BaseColumns._ID)
	private Long id;
	private String title;
	private String fromurl;
	private String imageurls;
	private Integer type;
	private Integer readed;

	public GroupImageInfo() {
	}

	public GroupImageInfo(Long id) {
		this.id = id;
	}

	public GroupImageInfo(Long id, String title, String fromurl,
			String imageurls, Integer type, Integer readed) {
		this.id = id;
		this.title = title;
		this.fromurl = fromurl;
		this.imageurls = imageurls;
		this.type = type;
		this.readed = readed;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	/** Not-null value. */
	public String getTitle() {
		return title;
	}

	/**
	 * Not-null value; ensure this value is available before it is saved to the
	 * database.
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	public String getFromurl() {
		return fromurl;
	}

	public void setFromurl(String fromurl) {
		this.fromurl = fromurl;
	}

	public String getImageurls() {
		return imageurls;
	}

	public void setImageurls(String imageurls) {
		this.imageurls = imageurls;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getReaded() {
		return readed;
	}

	public void setReaded(Integer readed) {
		this.readed = readed;
	}

}
