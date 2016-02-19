/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eu.verdelhan.ta4j.indicators.trackers;

import eu.verdelhan.ta4j.*;
import static eu.verdelhan.ta4j.TATestsUtils.assertDecimalEquals;
import eu.verdelhan.ta4j.indicators.simple.ClosePriceIndicator;
import eu.verdelhan.ta4j.mocks.MockTimeSeries;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import static eu.verdelhan.ta4j.TATestsUtils.assertDecimalEquals;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author sunzhu
 */
public class MACD2IndicatorTest
{
    
    private TimeSeries data;

    @Before
    public void setUp() {

        data = new MockTimeSeries(
            22.2734, 22.1940, 22.0847, 22.1741, 22.1840,
            22.1344, 22.2337, 22.4323, 22.2436, 22.2933,
            22.1542, 22.3926, 22.3816, 22.6109, 23.3558,
            24.0519, 23.7530, 23.8324, 23.9516, 23.6338,
            23.8225, 23.8722, 23.6537, 23.1870, 23.0976,
            23.3260, 22.6805, 23.0976, 22.4025, 22.1725
        );
    }

    @Test
    public void macdUsingClosePrice() {
        ClosePriceIndicator closePrice = new ClosePriceIndicator(data);
        MACD2Indicator macd = new MACD2Indicator(closePrice, 12,26,9);

        //assertEquals((Double)0.0000, macd.getValue(0));
        
        assertDecimalEquals(macd.getValue(9), 0.0194);
        assertDecimalEquals(macd.getValue(10), 0.0032);
        assertDecimalEquals(macd.getValue(11), 0.0235);
        assertDecimalEquals(macd.getValue(12), 0.0337);
        assertDecimalEquals(macd.getValue(13), 0.0677);
        assertDecimalEquals(macd.getValue(14), 0.1804);
        assertDecimalEquals(macd.getValue(15), 0.3299);
        assertDecimalEquals(macd.getValue(16), 0.3669);
        assertDecimalEquals(macd.getValue(17), 0.3789);
        assertDecimalEquals(macd.getValue(18), 0.3788);
        assertDecimalEquals(macd.getValue(19), 0.3145);

    }
    
}
