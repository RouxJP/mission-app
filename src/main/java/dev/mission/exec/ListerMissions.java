package dev.mission.exec;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;

@Controller
public class ListerMissions implements Runnable {
	private MissionRepository missionRepository;

	public ListerMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		for( Mission mission : missionRepository.findAll()) {
			System.out.println("Mission : " + mission.getId() + " - " + mission.getLibelle());
		}
	}
}