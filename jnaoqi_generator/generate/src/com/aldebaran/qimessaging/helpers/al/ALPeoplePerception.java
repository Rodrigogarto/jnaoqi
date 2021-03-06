package com.aldebaran.qimessaging.helpers.al;

import com.aldebaran.qimessaging.CallError;
import com.aldebaran.qimessaging.Session;
import com.aldebaran.qimessaging.helpers.ALModule;
import java.util.List;
import java.util.Map;
import com.aldebaran.qimessaging.*;

import java.util.List;

/**
 * Created by erwan and emile on 01/05/2014.
 */
public class ALPeoplePerception extends ALModule {

    public ALPeoplePerception(Session session) {
        super(session);
    }

    /**
    * Gets the time after which a person, supposed not to be in the field of view of the camera disappears if it has not been detected.
    * 
    * @return Time in seconds.
    */
    public Float getTimeBeforePersonDisappears() throws CallError, InterruptedException {
        return (Float)service.call("getTimeBeforePersonDisappears").get();
    }

    /**
    * Gets the current status of movement detection in Choregraphe.
    * 
    * @return True if movement detection is enabled, False otherwise.
    */
    public Boolean isMovementDetectionEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isMovementDetectionEnabled").get();
    }

    /**
    * Gets extractor running status
    * 
    * @return True if the extractor is currently processing images, False if not
    */
    public Boolean isProcessing() throws CallError, InterruptedException {
        return (Boolean)service.call("isProcessing").get();
    }

    /**
    * Turns fast mode on or off.
    * 
    * @param enable  True to turn it on, False to turn it off.
    */
    public void setFastModeEnabled(Boolean enable) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setFastModeEnabled", enable);
        else
            service.call("setFastModeEnabled", enable).get();
    }

    /**
    * Turns graphical display in Choregraphe on or off.
    * 
    * @param enable  True to turn it on, False to turn it off.
    */
    public void setGraphicalDisplayEnabled(Boolean enable) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setGraphicalDisplayEnabled", enable);
        else
            service.call("setGraphicalDisplayEnabled", enable).get();
    }

    /**
    * Gets the current minimum body height used for human detection (3D mode only).
    * 
    * @return Minimum height in meters.
    */
    public Float getMinimumBodyHeight() throws CallError, InterruptedException {
        return (Float)service.call("getMinimumBodyHeight").get();
    }

    /**
    * Sets the minimum human body height (3D mode only).
    * 
    * @param height  Minimum height in meters.
    */
    public void setMinimumBodyHeight(Float height) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setMinimumBodyHeight", height);
        else
            service.call("setMinimumBodyHeight", height).get();
    }

    /**
    * Sets the maximum human body height (3D mode only).
    * 
    * @param height  Maximum height in meters.
    */
    public void setMaximumBodyHeight(Float height) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setMaximumBodyHeight", height);
        else
            service.call("setMaximumBodyHeight", height).get();
    }

    /**
    * Turns movement detection on or off.
    * 
    * @param enable  True to turn it on, False to turn it off.
    */
    public void setMovementDetectionEnabled(Boolean enable) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setMovementDetectionEnabled", enable);
        else
            service.call("setMovementDetectionEnabled", enable).get();
    }

    /**
    * Sets the time after which a person, supposed not to be in the field of view of the camera disappears if it has not been detected.
    * 
    * @param seconds  Time in seconds.
    */
    public void setTimeBeforePersonDisappears(Float seconds) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setTimeBeforePersonDisappears", seconds);
        else
            service.call("setTimeBeforePersonDisappears", seconds).get();
    }

    /**
    * Sets the time after which a person, supposed to be in the field of view of the camera disappears if it has not been detected.
    * 
    * @param seconds  Time in seconds.
    */
    public void setTimeBeforeVisiblePersonDisappears(Float seconds) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setTimeBeforeVisiblePersonDisappears", seconds);
        else
            service.call("setTimeBeforeVisiblePersonDisappears", seconds).get();
    }

    /**
    * Gets the current maximum body height used for human detection (3D mode only).
    * 
    * @return Maximum height in meters.
    */
    public Float getMaximumBodyHeight() throws CallError, InterruptedException {
        return (Float)service.call("getMaximumBodyHeight").get();
    }

    /**
    * Sets the timeout before someone is removed from the MTM.
    * 
    * @param seconds  Time in seconds.
    */
    public void _setTimeBeforeMTMPruning(Float seconds) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("_setTimeBeforeMTMPruning", seconds);
        else
            service.call("_setTimeBeforeMTMPruning", seconds).get();
    }

    /**
    * Gets the mode (2D/3D) used for the people detection.
    * 
    * @return Current mode.
    */
    public String _getDetectionMode() throws CallError, InterruptedException {
        return (String)service.call("_getDetectionMode").get();
    }

    /**
    * Turns face detection on or off.
    * 
    * @param enable  True to turn it on, False to turn it off.
    */
    public void setFaceDetectionEnabled(Boolean enable) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setFaceDetectionEnabled", enable);
        else
            service.call("setFaceDetectionEnabled", enable).get();
    }

    /**
    * Gets the time after which a person, supposed to be in the field of view of the camera disappears if it has not been detected.
    * 
    * @return Time in seconds.
    */
    public Float getTimeBeforeVisiblePersonDisappears() throws CallError, InterruptedException {
        return (Float)service.call("getTimeBeforeVisiblePersonDisappears").get();
    }

    /**
    * Gets the current status of face detection.
    * 
    * @return True if face detection is enabled, False otherwise.
    */
    public Boolean isFaceDetectionEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isFaceDetectionEnabled").get();
    }

    /**
    * Gets the current maximum detection and tracking range.
    * 
    * @return Maximum range in meters.
    */
    public Float getMaximumDetectionRange() throws CallError, InterruptedException {
        return (Float)service.call("getMaximumDetectionRange").get();
    }

    /**
    * Gets the current status of fast mode.
    * 
    * @return True if fast mode is enabled, False otherwise.
    */
    public Boolean isFastModeEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isFastModeEnabled").get();
    }

    /**
    * Gets the current status of graphical display in Choregraphe.
    * 
    * @return True if graphical display is enabled, False otherwise.
    */
    public Boolean isGraphicalDisplayEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isGraphicalDisplayEnabled").get();
    }

    /**
    * Empties the tracked population.
    * 
    */
    public void resetPopulation() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("resetPopulation");
        else
            service.call("resetPopulation").get();
    }

    /**
    * Gets the current time before someone is removed from the MTM.
    * 
    * @return Time in seconds.
    */
    public Float _getTimeBeforeMTMPruning() throws CallError, InterruptedException {
        return (Float)service.call("_getTimeBeforeMTMPruning").get();
    }

    /**
    * Sets the maximum range for human detection and tracking.
    * 
    * @param range  Maximum range in meters.
    */
    public void setMaximumDetectionRange(Float range) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("setMaximumDetectionRange", range);
        else
            service.call("setMaximumDetectionRange", range).get();
    }

    /**
    * 
    * 
    */
    public Boolean isStatsEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isStatsEnabled").get();
    }

    /**
    * 
    * 
    */
    public void clearStats() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("clearStats");
        else
            service.call("clearStats").get();
    }

    /**
    * 
    * 
    */
    public Boolean isTraceEnabled() throws CallError, InterruptedException {
        return (Boolean)service.call("isTraceEnabled").get();
    }

    /**
    * Exits and unregisters the module.
    * 
    */
    public void exit() throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("exit");
        else
            service.call("exit").get();
    }

    /**
    * Returns the version of the module.
    * 
    * @return A string containing the version of the module.
    */
    public String version() throws CallError, InterruptedException {
        return (String)service.call("version").get();
    }

    /**
    * Just a ping. Always returns true
    * 
    * @return returns true
    */
    public Boolean ping() throws CallError, InterruptedException {
        return (Boolean)service.call("ping").get();
    }

    /**
    * Retrieves the module's method list.
    * 
    * @return An array of method names.
    */
    public List<String> getMethodList() throws CallError, InterruptedException {
        return (List<String>)service.call("getMethodList").get();
    }

    /**
    * Retrieves a method's description.
    * 
    * @param methodName  The name of the method.
    * @return A structure containing the method's description.
    */
    public java.lang.Object getMethodHelp(String methodName) throws CallError, InterruptedException {
        return (java.lang.Object)service.call("getMethodHelp", methodName).get();
    }

    /**
    * Retrieves the module's description.
    * 
    * @return A structure describing the module.
    */
    public java.lang.Object getModuleHelp() throws CallError, InterruptedException {
        return (java.lang.Object)service.call("getModuleHelp").get();
    }

    /**
    * Wait for the end of a long running method that was called using 'post'
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @param timeoutPeriod  The timeout period in ms. To wait indefinately, use a timeoutPeriod of zero.
    * @return True if the timeout period terminated. False if the method returned.
    */
    public Boolean wait(Integer id, Integer timeoutPeriod) throws CallError, InterruptedException {
        return (Boolean)service.call("wait", id, timeoutPeriod).get();
    }

    /**
    * Returns true if the method is currently running.
    * 
    * @param id  The ID of the method that was returned when calling the method using 'post'
    * @return True if the method is currently running
    */
    public Boolean isRunning(Integer id) throws CallError, InterruptedException {
        return (Boolean)service.call("isRunning", id).get();
    }

    /**
    * returns true if the method is currently running
    * 
    * @param id  the ID of the method to wait for
    */
    public void stop(Integer id) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("stop", id);
        else
            service.call("stop", id).get();
    }

    /**
    * Gets the name of the parent broker.
    * 
    * @return The name of the parent broker.
    */
    public String getBrokerName() throws CallError, InterruptedException {
        return (String)service.call("getBrokerName").get();
    }

    /**
    * Gets the method usage string. This summarises how to use the method.
    * 
    * @param name  The name of the method.
    * @return A string that summarises the usage of the method.
    */
    public String getUsage(String name) throws CallError, InterruptedException {
        return (String)service.call("getUsage", name).get();
    }

    /**
    * Subscribes to the extractor. This causes the extractor to start writing information to memory using the keys described by getOutputNames(). These can be accessed in memory using ALMemory.getData("keyName"). In many cases you can avoid calling subscribe on the extractor by just calling ALMemory.subscribeToEvent() supplying a callback method. This will automatically subscribe to the extractor for you.
    * 
    * @param name  Name of the module which subscribes.
    * @param period  Refresh period (in milliseconds) if relevant.
    * @param precision  Precision of the extractor if relevant.
    */
    public void subscribe(String name, Integer period, Float precision) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("subscribe", name, period, precision);
        else
            service.call("subscribe", name, period, precision).get();
    }

    /**
    * Subscribes to the extractor. This causes the extractor to start writing information to memory using the keys described by getOutputNames(). These can be accessed in memory using ALMemory.getData("keyName"). In many cases you can avoid calling subscribe on the extractor by just calling ALMemory.subscribeToEvent() supplying a callback method. This will automatically subscribe to the extractor for you.
    * 
    * @param name  Name of the module which subscribes.
    */
    public void subscribe(String name) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("subscribe", name);
        else
            service.call("subscribe", name).get();
    }

    /**
    * Unsubscribes from the extractor.
    * 
    * @param name  Name of the module which had subscribed.
    */
    public void unsubscribe(String name) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("unsubscribe", name);
        else
            service.call("unsubscribe", name).get();
    }

    /**
    * Updates the period if relevant.
    * 
    * @param name  Name of the module which has subscribed.
    * @param period  Refresh period (in milliseconds).
    */
    public void updatePeriod(String name, Integer period) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("updatePeriod", name, period);
        else
            service.call("updatePeriod", name, period).get();
    }

    /**
    * Updates the precision if relevant.
    * 
    * @param name  Name of the module which has subscribed.
    * @param precision  Precision of the extractor.
    */
    public void updatePrecision(String name, Float precision) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("updatePrecision", name, precision);
        else
            service.call("updatePrecision", name, precision).get();
    }

    /**
    * Gets the current period.
    * 
    * @return Refresh period (in milliseconds).
    */
    public Integer getCurrentPeriod() throws CallError, InterruptedException {
        return (Integer)service.call("getCurrentPeriod").get();
    }

    /**
    * Gets the current precision.
    * 
    * @return Precision of the extractor.
    */
    public Float getCurrentPrecision() throws CallError, InterruptedException {
        return (Float)service.call("getCurrentPrecision").get();
    }

    /**
    * Gets the period for a specific subscription.
    * 
    * @param name  Name of the module which has subscribed.
    * @return Refresh period (in milliseconds).
    */
    public Integer getMyPeriod(String name) throws CallError, InterruptedException {
        return (Integer)service.call("getMyPeriod", name).get();
    }

    /**
    * Gets the precision for a specific subscription.
    * 
    * @param name  name of the module which has subscribed
    * @return precision of the extractor
    */
    public Float getMyPrecision(String name) throws CallError, InterruptedException {
        return (Float)service.call("getMyPrecision", name).get();
    }

    /**
    * Gets the parameters given by the module.
    * 
    * @return Array of names and parameters of all subscribers.
    */
    public java.lang.Object getSubscribersInfo() throws CallError, InterruptedException {
        return (java.lang.Object)service.call("getSubscribersInfo").get();
    }

    /**
    * Get the list of values updated in ALMemory.
    * 
    * @return Array of values updated by this extractor in ALMemory
    */
    public List<String> getOutputNames() throws CallError, InterruptedException {
        return (List<String>)service.call("getOutputNames").get();
    }

    /**
    * Get the list of events updated in ALMemory.
    * 
    * @return Array of events updated by this extractor in ALMemory
    */
    public List<String> getEventList() throws CallError, InterruptedException {
        return (List<String>)service.call("getEventList").get();
    }

    /**
    * Get the list of events updated in ALMemory.
    * 
    * @return Array of events updated by this extractor in ALMemory
    */
    public List<String> getMemoryKeyList() throws CallError, InterruptedException {
        return (List<String>)service.call("getMemoryKeyList").get();
    }

    /**
    * Gets extractor pause status
    * 
    * @return True if the extractor is paused, False if not
    */
    public Boolean isPaused() throws CallError, InterruptedException {
        return (Boolean)service.call("isPaused").get();
    }

    /**
    * Changes the pause status of the extractor
    * 
    * @param status  New pause satus
    */
    public void pause(Boolean status) throws CallError, InterruptedException{
        if (isAsynchronous)
            service.call("pause", status);
        else
            service.call("pause", status).get();
    }

}
    