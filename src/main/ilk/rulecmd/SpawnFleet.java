package ilk.rulecmd;

import java.util.List;
import java.util.Map;

import com.fs.starfarer.api.campaign.InteractionDialogAPI;
import com.fs.starfarer.api.campaign.rules.MemoryAPI;
import com.fs.starfarer.api.impl.campaign.rulecmd.BaseCommandPlugin;
import com.fs.starfarer.api.util.Misc;

public class SpawnFleet extends BaseCommandPlugin {

  @Override
  public boolean execute(String s, InteractionDialogAPI interactionDialogAPI, List<Misc.Token> params,
      Map<String, MemoryAPI> memoryMap) {
    /*
     * TODO 0.9 readd later // parse input String faction =
     * params.get(0).getString(memoryMap); String fleetCompType =
     * params.get(1).getString(memoryMap); String location =
     * params.get(2).getString(memoryMap); String memKey = "$" +
     * params.get(3).getString(memoryMap);
     * 
     * // create a new fleet of our faction of interest and spawn it
     * CampaignFleetAPI fleet = Global.getSector().createFleet(faction,
     * fleetCompType); SectorEntityToken spawnLoc =
     * Global.getSector().getEntityById(location);
     * spawnLoc.getContainingLocation().spawnFleet(spawnLoc, 0, 0, fleet);
     * 
     * // add new fleet's id to memory, so we can check to see if it's still alive
     * later and do stuff String fleetID = fleet.getId();
     * Global.getSector().getMemory().set(memKey, fleetID);
     */
    return true;
  }
}
