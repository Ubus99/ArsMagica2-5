package am2.buffs;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.potion.Potion;

public class BuffEffectVanilla extends BuffEffect{

	private int potionID;

	public BuffEffectVanilla(int buffID, int duration, int amplifier){
		super(buffID, duration, amplifier);
		potionID = buffID;
	}

	@Override
	public void applyEffect(EntityLivingBase entityliving){
	}

	@Override
	public void stopEffect(EntityLivingBase entityliving){

	}

	@Override
	protected String spellBuffName(){
		return Potion.potionTypes[this.potionID].getName();
	}
}
