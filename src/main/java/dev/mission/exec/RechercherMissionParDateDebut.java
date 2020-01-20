package dev.mission.exec;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


@Controller
public class RechercherMissionParDateDebut implements Runnable {
	private MissionRepository missionRepository;

	public RechercherMissionParDateDebut( MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		LocalDate dateDebutRecherche = LocalDate.of(2019, 1, 1);
/**		
		int ids = 1;
		Optional<Mission> mission = missionRepository.findById(ids) ;
		
		System.out.println( "mission : " + mission.get().getLibelle() );
**/
		List<Mission> lstMissions = missionRepository.findByDateDebut( dateDebutRecherche) ;
			System.out.println("Liste des missions par date de début : ");
			for( Mission mission : lstMissions) {
				System.out.println( mission.getLibelle());
			}
	}
}