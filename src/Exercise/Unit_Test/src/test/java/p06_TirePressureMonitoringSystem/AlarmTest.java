package p06_TirePressureMonitoringSystem;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AlarmTest {

    @Test
    public void testLowerPressure(){
        Sensor sensor = Mockito.mock(Sensor.class);
        Alarm alarm = new Alarm(sensor);
        alarm.check();

        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(16.3);
        Assert.assertTrue(alarm.getAlarmOn());

    }

    @Test
    public void testHigherPressure(){
        Sensor sensor = Mockito.mock(Sensor.class);
        Alarm alarm = new Alarm(sensor);
        alarm.check();

        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(21.1);
        Assert.assertTrue(alarm.getAlarmOn());
    }

    @Test
    public void testCurretctPressure(){
        Sensor sensor = Mockito.mock(Sensor.class);
        Alarm alarm = new Alarm(sensor);
        Mockito.when(sensor.popNextPressurePsiValue()).thenReturn(20.1);

        alarm.check();
        Assert.assertFalse(alarm.getAlarmOn());
    }
}
