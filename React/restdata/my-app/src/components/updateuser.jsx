import React, { Component } from 'react'
import userservice from '../services/userservice';

class updateuser extends Component {
     constructor(props)
    {
        super(props)
        this.state={
            id:this.props.match.params.id,
            username:'',
            password:'',
            firstname:'',
            lastname:''
        }
        this.changeusernamehandler=this.changeusernamehandler.bind(this);
        this.changelastnamehandler=this.changelastnamehandler.bind(this);
        this.changefirstnamehandler=this.changefirstnamehandler.bind(this);
        this.changepasswordhandler=this.changepasswordhandler.bind(this);
        this.updateUser=this.updateUser.bind(this);
        this.Cancel=this.Cancel.bind(this);

    }
    componentDidMount(){
        userservice.getuserbyid(this.state.id).then((res)=>{
            let user=res.data;
            this.setState({
                username:user.username,
                password:user.password,
                firstname:user.firstname,
                lastname:user.lastname

            });
        });
    }
    changeusernamehandler=(event)=>{
        this.setState({username:event.target.value});
    }
    changelastnamehandler=(event)=>{
        this.setState({lastname:event.target.value});
    }
    changefirstnamehandler=(event)=>{
        this.setState({firstname:event.target.value});
    }
    changepasswordhandler=(event)=>{
        this.setState({password:event.target.value});
    }
    updateUser=(e)=>{
        e.preventDefault();
        let  user={username:this.state.username,password:this.state.password,firstname:this.state.firstname,lastname:this.state.lastname};
        console.log('user=>' +JSON.stringify(user));

        userservice.updateuser(user,this.state.id).then(res=>{
            this.props.history.push('/users');
        });
    }
    Cancel()
    {
        this.props.history.push('/users');
    }
    render() {
        return (
            <div>
               <div className="container">
                   <div className="row mt-4">
                       <div className= "card col-md-6 offset-md-3 offset-md-3 ">
                        <h1 className="text-center">Update User</h1>
                        <div className="card-body">
                            <form>
                                <div className="form-group">
                                    <label>username</label>
                                    <input placeholder="username" name="firstname" className="form-controle" type='text'
                                    value={this.state.username} onChange={this.changeusernamehandler}/>
                                </div>
                                <div className="form group">
                                    <label>password</label>
                                    <input placeholder="password" name="password" className="form-controle" type="password"
                                    value={this.state.password} onChange={this.changepasswordhandler}/>
                                </div>
                                <div className="form group">
                                    <label>firstname</label>
                                    <input placeholder="firstname" name="firstname" className="form-controle" type="text"
                                    value={this.state.firstname} onChange={this.changefirstnamehandler}/>
                                </div>
                                <div className="form group">
                                    <label>lastname</label>
                                    <input placeholder="lastname" name="lastname" className="form-controle" type="text"
                                    value={this.state.lastname} onChange={this.changelastnamehandler}/>
                                </div>
                                <button className="btn btn-success" onClick={this.updateUser}>Save</button>
                                <button className="btn btn-danger" onClick={this.Cancel}>cancel</button>
                            </form>
                        </div>
                       </div>
                   </div>
               </div>

            </div>
        )
    }
}
export default updateuser;