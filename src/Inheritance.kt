class Inheritance {

}

fun main(){
    var prodigyProgramming = Channel("GreyCoder",200000)
    print("channel eligible for silverPlayButton ? "+prodigyProgramming.eligibilitySilverPlayButton())
}

abstract class YouTuber{
    abstract var name:String
    abstract var numberOfSubs:Long

    fun changeOwnerShip(newOwner:String){
        this.name = newOwner
    }
}


class Channel(name:String,numberOfSubs:Long) : YouTuber(){
    override var name:String  = name
    override var numberOfSubs:Long = numberOfSubs
    lateinit var thumbNail:Array<Byte>
    fun eligibilitySilverPlayButton():Boolean{
        return numberOfSubs>100000
    }
}