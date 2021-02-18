package com.wrapper.octopusenergy;

import java.time.LocalDateTime;

import com.wrapper.octopusenergy.util.ISODateFormatter;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class GetProductsApiTest {

    @Test
    public void shouldCorrectlyFormatDateToISO8601Format() {
        // given
        LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);

        // when
        String formattedDate = ISODateFormatter.getFormattedDateTimeString(localDateTime);

        // then
        assertThat(formattedDate).isEqualTo("2021-01-01T00:00Z");
    }
}
