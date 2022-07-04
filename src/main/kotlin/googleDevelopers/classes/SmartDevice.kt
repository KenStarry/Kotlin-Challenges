package googleDevelopers.classes

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
    open val deviceType = "unknown"

    constructor(name: String, category: String, statusCode: Int) : this(name, category) {
        deviceStatus = when (statusCode) {
            0 -> "oflline"
            1 -> "online"
            else -> "unkown"
        }
    }

    open fun turnOn() {
        println("Smart device is turned on.")
    }

    open fun turnOff() {
        println("Smart device is turned off.")
    }
}

class SmartTvDevice(tvName: String, tvCategory: String) : SmartDevice(name = tvName, category = tvCategory) {

    override val deviceType = "Android TV"

    var speakerVolume = 2
        get() = field
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    var channelNumber = 1
        get() = field
        set(value) {
            if (value in 1..200) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        println("$name turned on. Speaker volume is at $speakerVolume and channel is at number $channelNumber")
    }

    override fun turnOff() {
        super.turnOff()
        println("$name turned off.  ")
    }

    fun increaseVolume() {
        speakerVolume++
        println("Increased volume to $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel increased to $channelNumber")
    }
}

class SmartLightDevice(lightName: String, lightCat: String) :
    SmartDevice(name = lightName, category = lightCat) {

    override val deviceType = "Smart Light"

    var brightnessLevel = 10
        set(value) {
            if (value in 0..100) {
                field = value
            }
        }

    override fun turnOn() {
        super.turnOn()
        brightnessLevel = 10
        println("$name turned on. Brightness level : $brightnessLevel")
    }

    override fun turnOff() {
        super.turnOff()
        brightnessLevel = 0
        println("$name turned off.")
    }

    fun increaseBrightness() {
        brightnessLevel++
        println("Brightness increased to $brightnessLevel")
    }
}

//  Smart home has a smart tv, and a smart light
class SmartHome(val smartTvDevice: SmartTvDevice, val smartLightDevice: SmartLightDevice) {

    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVolume() {
        smartTvDevice.increaseVolume()
    }

    fun changeChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }

    fun turnOnAllDevices() {
        turnOnTv()
        turnOnLight()
    }

    fun turnOffAllDevices() {
        turnOffTv()
        turnOnLight()
    }
}

fun main() {

    var smartDevice: SmartDevice = SmartTvDevice("Android", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utitlity")
    smartDevice.turnOn()
}
