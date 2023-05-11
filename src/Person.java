public class Person{
public String firstName;
public String lastname;
public int age;

    public static void main(String[] args) {

    }


public String getfirstName(){
    return firstName;
}

public String getLastname(){
    return lastname;
}
public int getAge(){
return age;
}

public void setFirstName(String firstName){
    this.firstName = firstName;

}
    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

public void setAge(int age){
if (age >0 && age <= 100) {
    this.age = age;
}
else {
    this.age = 0;
}
}
    public boolean isTeen(){
    if (age > 12 && age < 20) {
        return true;
    }
    return false;

    }
    public String getFullName (){
    if (firstName.isEmpty()){
 return lastname;
    }
if (lastname.isEmpty()){
    return firstName;
}
if (firstName.isEmpty() && lastname.isEmpty()){
    return "";

}
else{
    return firstName = " " + lastname;
}
}
}



