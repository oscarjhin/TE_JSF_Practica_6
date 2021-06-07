
package com.emergentes.validacion;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validadorCorreo")
public class ValidadorCorreo implements Validator{

    @Override
    public void validate(FacesContext context, UIComponent uIComponent, Object value) {
      Pattern pattern = Pattern.compile("\\w+@\\w+\\.\\w+");
      Matcher mather = pattern.matcher((CharSequence)value);
      HtmlInputText htmlInputText = (HtmlInputText ) uIComponent;
      String label="";
      if(htmlInputText.getLabel() == null || htmlInputText.getLabel().trim().equals(""))
      {
       label=htmlInputText.getLabel();
      }
      if(!mather.matches())
      {
          FacesMessage facesMessage= new FacesMessage(label+" : Correo no valido");
          throw new ValidatorException(facesMessage);
      }
    }
    
}
