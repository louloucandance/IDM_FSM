/**
 * generated by Xtext 2.12.0
 */
package fr.ice.m1.fsm.generator;

import fr.ice.m1.fsm.model.State;
import java.util.ArrayList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Conversions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class FSMGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field printStateClass is undefined");
  }
  
  public CharSequence printFSMClass(final ArrayList listState) {
    CharSequence _xblockexpression = null;
    {
      final int lengthState = ((Object[])Conversions.unwrapArray(listState, Object.class)).length;
      final int position = 0;
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class FSM{");
      _builder.newLine();
      _builder.append("State currentState;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public FSM(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("currentState = new ");
      Object _get = listState.get(0);
      _builder.append(_get, "\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("for(int position < ");
      _builder.append(lengthState, "\t");
      _builder.append(" ; ");
      _builder.append(position, "\t");
      _builder.append(" = 0; ");
      _builder.append(position, "\t");
      _builder.append("++){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("if ");
      Object _get_1 = listState.get(position);
      _builder.append(_get_1, "\t\t");
      _builder.append(" == currentState)");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("public void on(){\t\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(currentState instanceof ");
      Object _get_2 = listState.get(position);
      _builder.append(_get_2, "\t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("currentState = new ");
      Object _get_3 = listState.get((position - (1 % lengthState)));
      _builder.append(_get_3, "\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void off(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("if(currentState instanceof ");
      Object _get_4 = listState.get(position);
      _builder.append(_get_4, "\t");
      _builder.append(")");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("currentState = new ");
      Object _get_5 = listState.get((position + (1 % lengthState)));
      _builder.append(_get_5, "\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void stop(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("currentState = new ");
      Object _get_6 = listState.get(lengthState);
      _builder.append(_get_6, "\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public void step(String trigger){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("switch (currentState){");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("case ");
      Object _get_7 = listState.get((position % lengthState));
      _builder.append(_get_7, "\t\t");
      _builder.append(" : ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("if(trigger == currentState.transOut)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("currentState = new ");
      Object _get_8 = listState.get((position + (1 % lengthState)));
      _builder.append(_get_8, "\t\t\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("case ");
      Object _get_9 = listState.get((position % lengthState));
      _builder.append(_get_9, "\t\t");
      _builder.append(" : ");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t\t");
      _builder.append("if(trigger == currentState.transOut)");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("currentState = new ");
      Object _get_10 = listState.get((position - (1 % lengthState)));
      _builder.append(_get_10, "\t\t\t\t");
      _builder.append("();");
      _builder.newLineIfNotEmpty();
      _builder.append("\t\t");
      _builder.append("break;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("public static void main(){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.on();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.off();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.on();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.off();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.off();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.on();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.on();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.stop();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.off();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.on();");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("print currentState;");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence print(final State s) {
    CharSequence _xblockexpression = null;
    {
      String name = s.getName();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("public class ");
      _builder.append(name);
      _builder.append(" extends State{");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("public ");
      _builder.append(name, "\t");
      _builder.append("(){");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("name     = \"");
      _builder.append(name, "\t");
      _builder.append("\";");
      _builder.newLineIfNotEmpty();
      _builder.append("\t");
      _builder.append("transOut = out;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("transIn  = in;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("public setName(String name){");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("this.name = name;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _xblockexpression = _builder;
    }
    return _xblockexpression;
  }
  
  public CharSequence printStepClass() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public abstract class Step {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private String name;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Outgoing transOut;");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("private Incoming transIn;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@Override");
    _builder.newLine();
    _builder.append("public String toString(){");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("return this.name;");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
}
