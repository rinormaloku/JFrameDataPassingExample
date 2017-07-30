Code sample to answer [stackoverflow question](https://stackoverflow.com/questions/30861139/how-to-go-back-to-the-previous-gui-when-a-button-is-clicked-in-java)

Here we have FirstFrame and SecondFrame

In order to trigger update of the `jLabelRetrievedValue` field we have to implement `WindowFocusListener`

To get the values back to the **FirstFrame** I created a DataObject and passed its reference to SecondFrame where the 
Name name field got populated.

At the moment of getting back to the FirstFrame the window gains focus and fires `windowGainedFocus` event. 
In which we update the field.