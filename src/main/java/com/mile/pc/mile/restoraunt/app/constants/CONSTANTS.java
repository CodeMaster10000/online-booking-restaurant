package com.mile.pc.mile.restoraunt.app.constants;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.mile.pc.mile.restoraunt.app.model.Guest;
import com.mile.pc.mile.restoraunt.app.model.Reservation;

@Component
public class CONSTANTS {
	public final static long  FEE = 150;
	public final static int AFTER_RESERVATION_TIME = 45;
	public final static int BEFORE_RESERVATION_TIME = 45;
	public static final LocalTime START = LocalTime.of(7, 0);
	public static final LocalTime END = LocalTime.of(22, 0);
	public static final String DATETIME_FORMAT = "yyyy-MM-dd HH:mm";
    public static final LocalDateTime FIXED_DATE = LocalDateTime.now();
    public static final LocalTime MAX_TIME= LocalTime.of(23, 59); 
    public static LocalDateTimeSerializer LOCAL_DATETIME_SERIALIZER = new LocalDateTimeSerializer(DateTimeFormatter.ofPattern(DATETIME_FORMAT));
    public static final Reservation GUEST_RESERVATION = new Reservation(null,true,null,null,LocalDateTime.now(), LocalDateTime.now().plusHours(4),0, null, new Guest(), null, false);
}
