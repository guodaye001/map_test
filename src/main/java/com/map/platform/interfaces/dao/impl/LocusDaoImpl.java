package com.map.platform.interfaces.dao.impl;

import org.springframework.stereotype.Repository;

import com.map.platform.commons.dao.impl.BaseDaoImpl;
import com.map.platform.interfaces.beans.LocusInfo;
import com.map.platform.interfaces.dao.LocusDao;

@Repository("locusDao")
public class LocusDaoImpl extends BaseDaoImpl<LocusInfo> implements LocusDao{

}
