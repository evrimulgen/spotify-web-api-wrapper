package spotify.models.audio;

import java.util.List;

public class AudioFeaturesCollection {
    private List<AudioFeatures> audioFeatures;

    public List<AudioFeatures> getAudioFeatures() {
        return audioFeatures;
    }

    public void setAudioFeatures(List<AudioFeatures> audioFeatures) {
        this.audioFeatures = audioFeatures;
    }
}
