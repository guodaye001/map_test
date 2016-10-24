package com.map.platform.interfaces.service.impl;

import org.springframework.stereotype.Service;

import com.map.platform.commons.service.impl.BaseServiceImpl;
import com.map.platform.interfaces.beans.LocusInfo;
import com.map.platform.interfaces.service.ILocusService;

@Service("locusService")
public class LocusServiceImpl extends BaseServiceImpl<LocusInfo> implements ILocusService{
}
