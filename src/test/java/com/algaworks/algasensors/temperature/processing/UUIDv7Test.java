package com.algaworks.algasensors.temperature.processing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

class UUIDv7Test {

    @Test
    void shouldGenerateUUIDv7WithCurrentDateTime() {
        UUID uuid1 = IdGenerator.generateTimeBasedUUID();

        OffsetDateTime uuidDateTime = UUIDv7Utils.extractOffsetDateTime(uuid1).truncatedTo(ChronoUnit.MINUTES);
        OffsetDateTime currentOffsetDateTime = OffsetDateTime.now().truncatedTo(ChronoUnit.MINUTES);

        Assertions.assertEquals(currentOffsetDateTime, uuidDateTime);
    }
}
