package lab11.streamsschedule.model;

import java.time.LocalDateTime;

public record LiveStream(String id, String title, String description, String url, LocalDateTime startDate, LocalDateTime endDate) {
    public boolean isLive() {
        return LocalDateTime.now().isAfter(startDate) && LocalDateTime.now().isBefore(endDate);
    }
}
