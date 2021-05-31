package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.JobPositionService;
import kodlamaio.hrms.core.utilities.result.DataResult;
import kodlamaio.hrms.core.utilities.result.Result;
import kodlamaio.hrms.core.utilities.result.SuccesDataResult;
import kodlamaio.hrms.core.utilities.result.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.JobPositionDao;
import kodlamaio.hrms.entities.concretes.JobPosition;

@Service
public class JobPositionManager implements JobPositionService{

	private JobPositionDao positionDao;

	@Autowired
	public JobPositionManager(JobPositionDao positionDao) {
		super();
		this.positionDao=positionDao;
	}
	
	
	@Override
	public Result add(JobPosition position) {	
		this.positionDao.save(position);
		return new SuccessResult("İş pozisyonu eklendi");
	}

	@Override
	public Result delete(JobPosition position) {
		this.positionDao.save(position);
		return new SuccessResult("İş pozisyonu silindi");
	}


	@Override
	public Result update(JobPosition position) {	
		this.positionDao.save(position);
		return new SuccessResult("İş pozisyonu güncellendi");
	}

	

	@Override
	public 	DataResult<List<JobPosition> > getAll() {
		 return  new SuccesDataResult<List<JobPosition>>
		         (this.positionDao.findAll(), "Data Listelendi" );
				 
	}

}
