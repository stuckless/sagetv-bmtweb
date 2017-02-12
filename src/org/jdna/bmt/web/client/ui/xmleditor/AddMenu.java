package org.jdna.bmt.web.client.ui.xmleditor;

import java.io.Serializable;

public class AddMenu implements Serializable {
	public static final String MENU_SYSTEM_DEFAULT="";
	public static final String MENU_SYSTEM_P3="P3";
	public static final String MENU_SYSTEM_P3LITE="P3LITE";
	
	public AddMenu() {
	}
	public String menuId;
	public String menuLabel;
	public String viewId;
	public String viewPath;
	public boolean isBookmark;
	public boolean isInline;
	public String parentMenuId;
	public String parentMenuItemId;
	public boolean isBefore;
	public String description;
	public String menuSystem;
}
