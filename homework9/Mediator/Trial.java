public interface Trial extends TrialElements {
    public void addNewWitness(Witness w);
    public void setLeadWitness(Witness lw);
    public TrialState getNextTrialState( TrialState currentState )
    throws Exception;
    public void setCurrentTrialState( TrialState state );
    public Verdict getTrialVerdict();
}