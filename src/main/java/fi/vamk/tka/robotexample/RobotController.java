package fi.vamk.tka.robotexample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {
	@RequestMapping("/getRobotPosition")
	public String getRobotPosition() {
		aRobot = new Robot();
		return aRobot.getPosition();
	}

	private Robot aRobot;

}