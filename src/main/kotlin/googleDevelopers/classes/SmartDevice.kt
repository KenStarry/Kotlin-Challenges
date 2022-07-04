package googleDevelopers.classes

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

open class SmartDevice(val name: String, val category: String) {

    var deviceStatus = "online"
        protected set

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

    private var speakerVolume by RangeRegulator(initialValue = 2, minValue = 0, maxValue = 100)

    private var channelNumber by RangeRegulator(initialValue = 0, minValue = 0, maxValue = 1)

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

    private var brightnessLevel by RangeRegulator(initialValue = 1, minValue = 0, maxValue = 100)

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

    var deviceTurnOnCount = 0
        private set

    fun turnOnTv() {
        smartTvDevice.turnOn()
        deviceTurnOnCount++
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
        deviceTurnOnCount--
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

class RangeRegulator(
    initialValue: Int,
    private val minValue: Int,
    private val maxValue: Int
) : ReadWriteProperty<Any?, Int> {

    var fieldData = initialValue

    override fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        return fieldData
    }

    override fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {

        if (value in minValue..maxValue) {
            fieldData = value
        }
    }

}

fun main() {

    var smartDevice: SmartDevice = SmartTvDevice("Android", "Entertainment")
    smartDevice.turnOn()

    smartDevice = SmartLightDevice("Google Light", "Utitlity")
    smartDevice.turnOn()
}
