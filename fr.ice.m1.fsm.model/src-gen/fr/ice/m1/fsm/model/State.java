/**
 */
package fr.ice.m1.fsm.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.ice.m1.fsm.model.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fr.ice.m1.fsm.model.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link fr.ice.m1.fsm.model.State#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see fr.ice.m1.fsm.model.ModelPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link fr.ice.m1.fsm.model.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.ice.m1.fsm.model.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see fr.ice.m1.fsm.model.ModelPackage#getState_Incoming()
	 * @see fr.ice.m1.fsm.model.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link fr.ice.m1.fsm.model.Transition}.
	 * It is bidirectional and its opposite is '{@link fr.ice.m1.fsm.model.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fr.ice.m1.fsm.model.ModelPackage#getState_Outgoing()
	 * @see fr.ice.m1.fsm.model.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.ice.m1.fsm.model.ModelPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.ice.m1.fsm.model.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // State
