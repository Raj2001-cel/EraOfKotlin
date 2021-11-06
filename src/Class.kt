class Class {
    //this main function is called every time we run the code

}

fun main(){
    val note  = Note(2000)
    println("this denomination can be splitted ?"+note.isPossibleLooseNotes())

}
class Note(private var value:Int){
    fun isPossibleLooseNotes():Boolean{
        var denominations = arrayOf(5,10,20,50,100,200,500,2000)
        for(i in denominations){
            if(value%i!=0){
                return false
            }
        }
        return true
    }
}