
import java.util.regex.Pattern


class CredentialsValidation(private val  email:String,private val password:String) {

    fun isValidCredentials():Boolean{

        if(validateEmail()&&validatePassword()){
            return false
        }

        return true
    }

    fun validatePassword():Boolean{
        if(password.isEmpty()||password.length<3){
            print("password is length must be greater than 3")
            return false
        }

        if (!(password.contains("@") || password.contains("#")
                    || password.contains("!") || password.contains("~")
                    || password.contains("$") || password.contains("%")
                    || password.contains("^") || password.contains("&")
                    || password.contains("*") || password.contains("(")
                    || password.contains(")") || password.contains("-")
                    || password.contains("+") || password.contains("/")
                    || password.contains(":") || password.contains(".")
                    || password.contains(", ") || password.contains("<")
                    || password.contains(">") || password.contains("?")
                    || password.contains("|"))){
                        print("no special character")
            return false
        }

        return true
    }


    fun validateEmail():Boolean{

           var  regexPattern = Pattern.compile("^[(a-zA-Z-0-9-\\_\\+\\.)]+@[(a-z-A-z)]+\\.[(a-zA-z)]{2,3}$")
            var regMatcher   = regexPattern.matcher(email);
            if(regMatcher.matches()) {
                return true;
            } else {
                return false;
            }


    }
}


fun main(){
    val isValid  = CredentialsValidation("demo@gmail.com","demo345@90").isValidCredentials()
    print(isValid)
}

