/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * Server controlled "content-developer" integers.
 *
 * VarPlayers are stored per RuneScape player save, and synchronized
 * from the server to the client. The client can change them preemptively
 * if it thinks they will change the next tick as a lag-hiding measure.
 * The client CANNOT directly make the server change a varbit.
 */
@AllArgsConstructor
@Getter
public enum VarPlayer
{
	POUCH_STATUS(261),
	DUEL_PENDING(286),
	ATTACK_STYLE(43),
	QUEST_POINTS(101),
	IS_POISONED(102),
	/**
	 * Seems to start at 50(10 splash) and goes down by 1 every 30 seconds
	 */
	DISEASE_VALUE(456),

	BANK_TAB(115),

	MEMBERSHIP_DAYS(1780),

	SPECIAL_ATTACK_PERCENT(300),
	SPECIAL_ATTACK_ENABLED(301),

	IN_RAID_PARTY(1427),

	NMZ_REWARD_POINTS(1060),

	/**
	 * The 11 least significant bits of this var correspond to the player
	 * you're currently fighting. Value is -1 when not fighting any player.
	 *
	 * Client.getVar(ATTACKING_PLAYER) & 2047 == Client.getLocalInteractingIndex();
	 */
	ATTACKING_PLAYER(1075),

	/**
	 * -1 : Poison immune
	 *  Normal poison damage is ceil( this / 5.0f )
	 *  If this is greater than or equal to 1000000, the player is envenomed.
	 *  Venom damage is (this - 999997) * 2
	 */
	POISON(102),

	/**
	 * 0 : not started
	 * greater than 0 : in progress
	 * greater than 99 : completed
	 */
	THRONE_OF_MISCELLANIA(359),

	/**
	 * Item currently active in the creation of a buy or sell offer
	 */
	CURRENT_GE_ITEM(1151),

	/**
	 * Experience tracker goal start.
	 */
	ATTACK_GOAL_START(1229),
	STRENGTH_GOAL_START(1230),
	RANGED_GOAL_START(1231),
	MAGIC_GOAL_START(1232),
	DEFENCE_GOAL_START(1233),
	HITPOINTS_GOAL_START(1234),
	PRAYER_GOAL_START(1235),
	AGILITY_GOAL_START(1236),
	HERBLORE_GOAL_START(1237),
	THIEVING_GOAL_START(1238),
	CRAFTING_GOAL_START(1239),
	RUNECRAFT_GOAL_START(1240),
	MINING_GOAL_START(1241),
	SMITHING_GOAL_START(1242),
	FISHING_GOAL_START(1243),
	COOKING_GOAL_START(1244),
	FIREMAKING_GOAL_START(1245),
	WOODCUTTING_GOAL_START(1246),
	FLETCHING_GOAL_START(1247),
	SLAYER_GOAL_START(1248),
	FARMING_GOAL_START(1249),
	CONSTRUCTION_GOAL_START(1250),
	HUNTER_GOAL_START(1251),

	/**
	 * Experience tracker goal end.
	 */
	ATTACK_GOAL_END(1253),
	STRENGTH_GOAL_END(1254),
	RANGED_GOAL_END(1255),
	MAGIC_GOAL_END(1256),
	DEFENCE_GOAL_END(1257),
	HITPOINTS_GOAL_END(1258),
	PRAYER_GOAL_END(1259),
	AGILITY_GOAL_END(1260),
	HERBLORE_GOAL_END(1261),
	THIEVING_GOAL_END(1262),
	CRAFTING_GOAL_END(1263),
	RUNECRAFT_GOAL_END(1264),
	MINING_GOAL_END(1265),
	SMITHING_GOAL_END(1266),
	FISHING_GOAL_END(1267),
	COOKING_GOAL_END(1268),
	FIREMAKING_GOAL_END(1269),
	WOODCUTTING_GOAL_END(1270),
	FLETCHING_GOAL_END(1271),
	SLAYER_GOAL_END(1272),
	FARMING_GOAL_END(1273),
	CONSTRUCTION_GOAL_END(1274),
	HUNTER_GOAL_END(1275),

	/**
	 * Bird house states
	 */
	BIRD_HOUSE_MEADOW_NORTH(1626),
	BIRD_HOUSE_MEADOW_SOUTH(1627),
	BIRD_HOUSE_VALLEY_NORTH(1628),
	BIRD_HOUSE_VALLEY_SOUTH(1629),

	/**
	 * Slayer unlock bitfields
	 */
	SLAYER_UNLOCK_1(1076),
	SLAYER_UNLOCK_2(1344),

	/**
	 * Music track unlock bitfields
	 */
	MUSIC_TRACKS_UNLOCKED_1(20),
	MUSIC_TRACKS_UNLOCKED_2(21),
	MUSIC_TRACKS_UNLOCKED_3(22),
	MUSIC_TRACKS_UNLOCKED_4(23),
	MUSIC_TRACKS_UNLOCKED_5(24),
	MUSIC_TRACKS_UNLOCKED_6(25),
	MUSIC_TRACKS_UNLOCKED_7(298),
	MUSIC_TRACKS_UNLOCKED_8(311),
	MUSIC_TRACKS_UNLOCKED_9(346),
	MUSIC_TRACKS_UNLOCKED_10(414),
	MUSIC_TRACKS_UNLOCKED_11(464),
	MUSIC_TRACKS_UNLOCKED_12(598),
	MUSIC_TRACKS_UNLOCKED_13(662),
	MUSIC_TRACKS_UNLOCKED_14(721),
	MUSIC_TRACKS_UNLOCKED_15(906),
	MUSIC_TRACKS_UNLOCKED_16(1009),
	MUSIC_TRACKS_UNLOCKED_17(1338),
	MUSIC_TRACKS_UNLOCKED_18(1681),
	MUSIC_TRACKS_UNLOCKED_19(2065),

	MUSIC_VOLUME(168),
	SOUND_EFFECT_VOLUME(169),
	AREA_EFFECT_VOLUME(872),

	/**
	 * f2p Quest varbits, these don't hold the completion value.
	 */
	QUEST_BLACK_KNIGHTS_FORTRESS(130),
	QUEST_COOKS_ASSISTANT(29),
	QUEST_DORICS_QUEST(31),
	QUEST_DRAGON_SLAYER(176),
	QUEST_ERNEST_THE_CHICKEN(32),
	QUEST_IMP_CATCHER(160),
	QUEST_THE_KNIGHTS_SWORD(122),
	QUEST_PIRATES_TREASURE(71),
	QUEST_PRINCE_ALI_RESCUE(273),
	QUEST_THE_RESTLESS_GHOST(107),
	QUEST_ROMEO_AND_JULIET(144),
	QUEST_RUNE_MYSTERIES(63),
	QUEST_SHEEP_SHEARER(179),
	QUEST_SHIELD_OF_ARRAV(145),
	QUEST_SHIELD_OF_ARRAV_STATE_146(146),
	QUEST_VAMPIRE_SLAYER(178),
	QUEST_WITCHS_POTION(67),

	/**
	 * member Quest varbits, these don't hold the completion value.
	 */
	QUEST_BIG_CHOMPY_BIRD_HUNTING(293),
	QUEST_BIOHAZARD(68),
	QUEST_CABIN_FEVER(655),
	QUEST_CLOCK_TOWER(10),
	QUEST_CREATURE_OF_FENKENSTRAIN(399),
	QUEST_DEATH_PLATEAU(314),
	QUEST_THE_DIG_SITE(131),
	QUEST_DRUIDIC_RITUAL(80),
	QUEST_DWARF_CANNON(0),
	QUEST_EADGARS_RUSE(335),
	QUEST_ELEMENTAL_WORKSHOP_I(299),
	QUEST_FAMILY_CREST(148),
	QUEST_FIGHT_ARENA(17),
	QUEST_FISHING_CONTEST(11),
	QUEST_THE_FREMENNIK_TRIALS(347),
	QUEST_WATERFALL_QUEST(65),
	QUEST_GERTRUDES_CAT(180),
	QUEST_THE_GRAND_TREE(150),
	QUEST_HAUNTED_MINE(382),
	QUEST_HAZEEL_CULT(223),
	QUEST_HEROES_QUEST(188),
	QUEST_HOLY_GRAIL(5),
	QUEST_IN_SEARCH_OF_THE_MYREQUE(387),
	QUEST_JUNGLE_POTION(175),
	QUEST_LEGENDS_QUEST(139),
	QUEST_LOST_CITY(147),
	QUEST_MERLINS_CRYSTAL(14),
	QUEST_MONKEY_MADNESS_I(365),
	QUEST_MONKS_FRIEND(30),
	QUEST_MOURNINGS_END_PART_I(517),
	QUEST_MURDER_MYSTERY(192),
	QUEST_NATURE_SPIRIT(307),
	QUEST_OBSERVATORY_QUEST(112),
	QUEST_ONE_SMALL_FAVOUR(416),
	QUEST_PLAGUE_CITY(165),
	QUEST_PRIEST_IN_PERIL(302),
	QUEST_RAG_AND_BONE_MAN(714),
	QUEST_REGICIDE(328),
	QUEST_ROVING_ELVES(402),
	QUEST_RUM_DEAL(600),
	QUEST_SCORPION_CATCHER(76),
	QUEST_SEA_SLUG(159),
	QUEST_SHADES_OF_MORTTON(339),
	QUEST_SHEEP_HERDER(60),
	QUEST_SHILO_VILLAGE(116),
	QUEST_TAI_BWO_WANNAI_TRIO(320),
	QUEST_TEMPLE_OF_IKOV(26),
	QUEST_THRONE_OF_MISCELLANIA(359),
	QUEST_THE_TOURIST_TRAP(197),
	QUEST_WITCHS_HOUSE(226),
	QUEST_TREE_GNOME_VILLAGE(111),
	QUEST_TRIBAL_TOTEM(200),
	QUEST_TROLL_ROMANCE(385),
	QUEST_TROLL_STRONGHOLD(317),
	QUEST_UNDERGROUND_PASS(161),
	QUEST_UNDERGROUND_PASS_STATE_162(162),
	QUEST_WATCHTOWER(212),
	QUEST_THE_GREAT_BRAIN_ROBBERY(980),
	QUEST_RAG_AND_BONE_MAN_II(714),

	/**
	 * mini-quest varbits, these don't hold the completion value.
	 */
	QUEST_ENTER_THE_ABYSS(492),
	QUEST_ALFRED_GRIMHANDS_BARCRAWL(77),
	QUEST_ALFRED_GRIMHANDS_BARCRAWL_STATE_76(76),
	QUEST_THE_MAGE_ARENA(267);



	public final int id;
}
