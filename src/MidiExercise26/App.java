package MidiExercise26;

import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiSystem;
import javax.sound.midi.MidiUnavailableException;
import javax.sound.midi.ShortMessage;
import java.util.List;
import static MidiExercise26.Chord.Type.*;

public class App {
    public static void main(String[] args) throws MidiUnavailableException, InvalidMidiDataException, InterruptedException {
        var receiver = MidiSystem.getReceiver();
        System.out.println("First way");
        List<Chord> chords = List.of(
                new Chord(60, MAJOR),
                new Chord(60, SUS4),
                new Chord(55, MAJOR),
                new Chord(55, SUS4),
                new Chord(55, MAJOR),
                new Chord(55, SUS4),
                new Chord(55, MAJOR),
                new Chord(55, SUS4)
        );

        int time = 0;
        for (var chord: chords) {
            for (var note: chord) {
                receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), time * 1_000_000);
                receiver.send(new ShortMessage(ShortMessage.NOTE_OFF, 0, note, 127), (time +1) * 1_000_000);
            }
            time++;
        }

        System.out.println("Second way");
//        int[] notes = {60, 64, 67, 60, 65, 67, 55, 59, 62, 55, 60, 62, 53, 57, 60, 53, 58, 60};
//        int[] times = {0, 0, 0, 1000, 1000, 1000, 2000, 2000, 2000, 3000, 3000, 3000, 4000, 4000, 4000, 5000, 5000, 5000};
//
//        for (int i =0; i < notes.length; i++) {
//            int note = notes[i];
//            int timeSecond = times[i];
//            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), timeSecond * 1000);
//            receiver.send(new ShortMessage(ShortMessage.NOTE_ON, 0, note, 127), (timeSecond + 1000) * 1000);
//        }

        Thread.sleep(12000);
    }
}
