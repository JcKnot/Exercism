import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

class AppointmentScheduler {
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        LocalDateTime now = LocalDateTime.now();
        return now.isAfter(appointmentDate);
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        LocalTime horaEvento = appointmentDate.toLocalTime();
        LocalTime horaFim = LocalTime.of(18,0,0);
        LocalTime horaInicio = LocalTime.of(12,0,0);

        return !horaEvento.isBefore(horaInicio) && horaEvento.isBefore(horaFim);
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String fechaHora = appointmentDate
                .format(DateTimeFormatter
                .ofPattern("EEEE, MMMM d, yyyy, 'at' h:mm a.", Locale.ENGLISH));

        return "You have an appointment on " + fechaHora;

    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 15);
    }
}
