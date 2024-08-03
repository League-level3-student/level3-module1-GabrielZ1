package _07_Meeting_Scheduler;

import java.util.ArrayList;

public class MeetingScheduler {
	/*
	 * Your task is to code a method to find a meeting time for two people
	 * given their schedules.
	 * 
	 * Code the method below so that it returns a Schedule object that contains
	 * all the times during the week that are in BOTH people's schedules. The
	 * Schedule class is included in this package.
	 * 
	 * Example:
	 * person1 availability - Monday at 9, Tuesday at 14, and Friday 10
	 * person2 availability - Tuesday at 14, Friday 8, and Monday at 9
	 * The returned HashMap should contain: Tuesday 14 and Monday 9
	 * 
	 * The returned Schedule object represents the times both people are
	 * available for a meeting.
	 * 
	 * Time availability is always at the top of the hour, so 9:30 is not valid
	 * Time availability always represents 1 hour
	 * Assume both schedules are in the same time zones
	 */
	public static Schedule getMutualAvailability(Schedule person1, Schedule person2) {
		Schedule toReturn = new Schedule();

		ArrayList<Integer> mondayList = new ArrayList<Integer>();
		ArrayList<Integer> tuesdayList = new ArrayList<Integer>();
		ArrayList<Integer> wednesdayList = new ArrayList<Integer>();
		ArrayList<Integer> thursdayList = new ArrayList<Integer>();
		ArrayList<Integer> fridayList = new ArrayList<Integer>();
		ArrayList<Integer> saturdayList = new ArrayList<Integer>();
		ArrayList<Integer> sundayList = new ArrayList<Integer>();



		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Monday").contains(i) && person2.getSchedule().get("Monday").contains(i)) {
				mondayList.add(i);
			}
		}
		toReturn.getSchedule().put("Monday", mondayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Tuesday").contains(i) && person2.getSchedule().get("Tuesday").contains(i)) {
				tuesdayList.add(i);
			}
		}
		toReturn.getSchedule().put("Tuesday", tuesdayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Wednesday").contains(i) && person2.getSchedule().get("Wednesday").contains(i)) {
				wednesdayList.add(i);
			}
		}
		toReturn.getSchedule().put("Wednesday", wednesdayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Thursday").contains(i) && person2.getSchedule().get("Thursday").contains(i)) {
				thursdayList.add(i);
			}
		}
		toReturn.getSchedule().put("Thursday", thursdayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Friday").contains(i) && person2.getSchedule().get("Friday").contains(i)) {
				fridayList.add(i);
			}
		}
		toReturn.getSchedule().put("Friday", fridayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Saturday").contains(i) && person2.getSchedule().get("Saturday").contains(i)) {
				saturdayList.add(i);
			}
		}
		toReturn.getSchedule().put("Saturday", saturdayList);


		for(int i = 0; i<=23; i++) {
			if(person1.getSchedule().get("Sunday").contains(i) && person2.getSchedule().get("Sunday").contains(i)) {
				sundayList.add(i);
			}
		}
		toReturn.getSchedule().put("Sunday", sundayList);




		return toReturn;
	}
}
