package js.examples;

import java.io.FileReader;

import javax.script.Bindings;
import javax.script.ScriptContext;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class JavaScriptExample {

	public static void main(String[] args) {
		
		ScriptEngine ee = new ScriptEngineManager().getEngineByName("Nashorn");
		
		Bindings bind = ee.getBindings(ScriptContext.ENGINE_SCOPE);
		
		bind.put("goodbye", " Byebye!!!");
		
		try {
			ee.eval(new FileReader("javascript/helloworld.js"));
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
