import org.appfuse.service.GenericManager;
import org.springframework.web.bind.annotation.RequestMethod;

import model.Empleado;

@Controller
@RequestMapping("/empleados*")
public class EmpleGenericManager<T, Serializable>{
	private GenericManager<Empleado,Integer> empleadoManager;
	
	@Autowired
	public void setEmpleadoManager(@Qualifier"empleadoManager") GenericManager<Empleado,Integer>empleadoManager{
		this.empleadoManager= empleadoManager;
	}
	@RequesMapping(method=RequestMethod.GET)
	public ModelAndView handleRequest() throws Exception{
		return new ModelAndView().addObject(empleadoManager.getAll()):
	}
}
