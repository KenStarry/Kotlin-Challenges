package googleDevelopers.classes

class SmartDevice {

    fun turnOn() {
        println("Smart device is turned on.")
    }

    fun turnOff() {
        println("Smart device is turned off.")
    }
}

fun main() {

    val smartDevice = SmartDevice()

    smartDevice.turnOn()
    smartDevice.turnOff()
}
