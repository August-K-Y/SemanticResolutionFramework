package umbc.ebiquity.kang.ontologyinitializator.repository.interfaces;

import java.util.Collection;

import umbc.ebiquity.kang.ontologyinitializator.repository.MappingBasicInfo;
import umbc.ebiquity.kang.ontologyinitializator.repository.MappingDetailInfo;

public interface IMappingInfoRepository {

	public boolean saveRepository();
	
	public void updateMappingInfo(Collection<IInstanceRecord> instances);
	
	public MappingBasicInfo getMappingBasicInfo();
	
	public MappingDetailInfo getMappingDetailInfo();

	public IInstanceRecord createInstanceClassificationRecord();
	
	public IClassifiedInstanceBasicRecord getClassifiedInstanceBasicInfoByInstanceName(String instanceName);
	
	public IClassifiedInstanceDetailRecord getClassifiedInstanceDetailInfoByInstanceName(String instanceName);
	
	public void showRepositoryDetail();

	public String getRepositoryName();
	
}
