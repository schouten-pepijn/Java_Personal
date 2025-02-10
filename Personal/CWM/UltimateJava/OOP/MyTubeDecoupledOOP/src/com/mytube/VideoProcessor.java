package com.mytube;

public class VideoProcessor {
    // contructor injection fields
    private VideoEncoder encoder;
    private VideoDatabase database;
    private NotificationService notificationService;

    // constructor injection
    public VideoProcessor(
        VideoEncoder encoder,
        VideoDatabase database,
        NotificationService emailService
    ) {
        this.encoder = encoder;
        this.database = database;
        this.notificationService = emailService;
    }

    public void process(Video video) {
        encoder.encode(video);
        database.store(video);
        notificationService.notify(video.getUser());
    }
}

