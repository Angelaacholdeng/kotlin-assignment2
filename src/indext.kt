fun main() {
    var gari=Car("toyota","camry","black",8)
    gari.carry(20)
    gari.identity()
    println(gari.calculateParkingFee(46))
    var lory=Bus("toyo","Benz","red",66)
    println(lory.maxTripFare(500.4))
    println(lory.calculateParkingFee(3))

}
class Car(make:String,model:String,colour:String,capacity:Int):Vehicle(make,model,colour,capacity){
    fun identity(){
        print("I am a black toyota camry")

    }
}
class Bus(make:String,model:String,colour:String,capacity:Int) :Vehicle(make,model,colour,capacity){
    fun maxTripFare(fare: Double): Double {
        return fare * capacity
    }

override fun calculateParkingFee(hours:Int):Int {
    return capacity * hours
}}
open class Vehicle(var make:String,var model:String,var colour:String,var capacity:Int){
    fun carry(people:Int){
        if (people<=capacity) {
            println("carrying $people passengers");
        }
        else{
            println("over capacity by $people");
        }
    }
    open fun calculateParkingFee(hours:Int):Int{
        return hours*20
    }

}









