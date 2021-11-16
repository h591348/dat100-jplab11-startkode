package no.hvl.dat100.jplab11.oppgave3;

import no.hvl.dat100.jplab11.common.TODO;
import no.hvl.dat100.jplab11.oppgave1.*;
import no.hvl.dat100.jplab11.oppgave2.Tekst;

public class Blogg {

	private Innlegg[] innleggTabell;
	private int nesteledig;


	public Blogg() {
		innleggTabell = new Innlegg[20];
		nesteledig = 0;
	}

	public Blogg(int lengde) {
		innleggTabell = new Innlegg[lengde];
		nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggTabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		if (finnes(innlegg)){
			for (int i = 0; i < nesteledig; i++) {
				if (innleggTabell[i].erLik(innlegg)){
					return i;
				}

			}
		}

		return -1;
	}

	public boolean finnes(Innlegg innlegg) {
		if (nesteledig>0){
			for (int i = 0; i < nesteledig; i++) {
				if (innleggTabell[i].erLik(innlegg)){
					return true;
				}
				
			}
		}
		return false;
	}

	public boolean ledigPlass() {
		if (nesteledig<innleggTabell.length){
			return true;
		}
return false;
	}
	
	public boolean leggTil(Innlegg innlegg) {


		if (ledigPlass() && !finnes(innlegg) ){
			innleggTabell[nesteledig] = innlegg;
			nesteledig++;
			return true;
		}

return false;
	}
	
	public String toString() {
		String s ="";
		if (nesteledig>0) {
			for (int i = 0; i < nesteledig; i++) {
				s+=innleggTabell[i];
			}
		}
		return nesteledig + "\n" + s;
	}

	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		throw new UnsupportedOperationException(TODO.method());
	}
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}