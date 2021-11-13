HomeController.java @Controller
public class HelloController {
	
@RequestMapping("/hello")
	public String redirect()
	{
		return "viewpage";
	}

@RequestMapping("/helloagain")
public String display()
{
	return "final";
}

}